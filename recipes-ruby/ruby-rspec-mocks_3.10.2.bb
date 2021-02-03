SUMMARY = "RubyGem: rspec-mocks"
DESCRIPTION = "RSpec's 'test double' framework, with support for stubbing and mocking"
HOMEPAGE = "https://github.com/rspec/rspec-mocks"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3d96800bd9b5ffa0ed091438eaea6f01"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-diff-lcs \
                  ruby-rspec-support"

SRC_URI[md5sum] = "23cf53caff14f2463116c9ffce67f6f8"
SRC_URI[sha256sum] = "93fc76e312c3d19cacc1cb2eb64bf82731de2e216295cf2b4d0ce31ba77923b4"

GEM_NAME = "rspec-mocks"

inherit rubygems
