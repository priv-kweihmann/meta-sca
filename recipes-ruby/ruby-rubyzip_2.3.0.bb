SUMMARY = "RubyGem: rubyzip"
DESCRIPTION = "rubyzip is a ruby module for reading and writing zip files"
HOMEPAGE = "http://github.com/rubyzip/rubyzip"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://samples/example_filesystem.rb;beginline=30;endline=31;md5=fafd70aa8bcac3f8b39a140662f1c0fb"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "3a836c8f901f875882dde4e58178bbf8"
SRC_URI[sha256sum] = "5196155ab0d4060e4b4a482c1c1bd43198149605bd925fee4d40c494afa82015"

GEM_NAME = "rubyzip"

inherit rubygems
