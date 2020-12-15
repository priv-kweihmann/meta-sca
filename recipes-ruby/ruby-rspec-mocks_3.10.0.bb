SUMMARY = "RubyGem: rspec-mocks"
DESCRIPTION = "RSpec's 'test double' framework, with support for stubbing and mocking"
HOMEPAGE = "https://github.com/rspec/rspec-mocks"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3d96800bd9b5ffa0ed091438eaea6f01"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-diff-lcs \
                  ruby-rspec-support"

SRC_URI[md5sum] = "ff20c9465f39c18c06269c7e728397cb"
SRC_URI[sha256sum] = "83578f61d159c3173ca097da836044610cc8eaf4e2bcfc3972260a51824fe8df"

GEM_NAME = "rspec-mocks"

inherit rubygems
