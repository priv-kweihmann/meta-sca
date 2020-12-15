SUMMARY = "RubyGem: rspec-expectations"
DESCRIPTION = "rspec-expectations provides a simple, readable API to express expected outcomes of a code example."
HOMEPAGE = "https://github.com/rspec/rspec-expectations"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3d96800bd9b5ffa0ed091438eaea6f01"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-diff-lcs \
                  ruby-rspec-support"

SRC_URI[md5sum] = "0b9740b737fb0fbe0670c6bfb831a98e"
SRC_URI[sha256sum] = "ac19f5d38ff95e00537a78a9c0a470876607fe76fe888e1b925c2eb7ed6e6748"

GEM_NAME = "rspec-expectations"

inherit rubygems
