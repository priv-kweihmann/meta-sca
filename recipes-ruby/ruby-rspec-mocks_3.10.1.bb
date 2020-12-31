SUMMARY = "RubyGem: rspec-mocks"
DESCRIPTION = "RSpec's 'test double' framework, with support for stubbing and mocking"
HOMEPAGE = "https://github.com/rspec/rspec-mocks"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3d96800bd9b5ffa0ed091438eaea6f01"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-diff-lcs \
                  ruby-rspec-support"

SRC_URI[md5sum] = "b29598e788d8fba4b16c69023d16b14b"
SRC_URI[sha256sum] = "1467e984ac20b1cda924430fde081de8b5e0ef0d2147b2668c09118c8b9e8af4"

GEM_NAME = "rspec-mocks"

inherit rubygems
