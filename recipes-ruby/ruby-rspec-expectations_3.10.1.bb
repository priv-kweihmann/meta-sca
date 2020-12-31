SUMMARY = "RubyGem: rspec-expectations"
DESCRIPTION = "rspec-expectations provides a simple, readable API to express expected outcomes of a code example."
HOMEPAGE = "https://github.com/rspec/rspec-expectations"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3d96800bd9b5ffa0ed091438eaea6f01"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-diff-lcs \
                  ruby-rspec-support"

SRC_URI[md5sum] = "65cca592c5fd3044456099f45d159b5d"
SRC_URI[sha256sum] = "27acf5d5df13f8cc8f7158001ebf572513bcec3d45404ba76e0a8998895ce9eb"

GEM_NAME = "rspec-expectations"

inherit rubygems
