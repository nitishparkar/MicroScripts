import eyeD3
import os
import fnmatch
#---------------------------------------------
"""
A program that changes title, artist and album information of mp3 files in 'Title' case. 
The program uses eyeD3 library to acess ID3 metadata.
"""
def modifyEyeD3Tags(path):
	tag = eyeD3.Tag()
	tag.link(path)
	
	song_artist = tag.getArtist()
	song_album = tag.getAlbum()
	song_title = tag.getTitle()
	"""
	print song_artist
	print song_album
	print song_title
	"""
	song_artist=song_artist.title()
	song_album=song_album.title()
	song_title=song_title.title()
	
	tag.setArtist(song_artist)
	tag.setAlbum(song_album)
	tag.setTitle(song_title)
	tag.update()
	"""
	print song_artist
	print song_album
	print song_title
	"""

directory = os.path.dirname(os.path.realpath(__file__))
print "Directory => ",directory 
files_list = os.listdir(directory)
print "Starting Tag Modification"
for x in files_list:
	if fnmatch.fnmatch(x, '*.mp3'):
		print "File:",x
		modifyEyeD3Tags(x)
print "Finished Tag Modification"