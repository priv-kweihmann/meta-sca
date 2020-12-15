SUMMARY = "RubyGem: activesupport"
DESCRIPTION = "A toolkit of support libraries and Ruby core extensions extracted from the Rails framework"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=a2e0e281b9b6c47f722da2255eca5d68"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-concurrent-ruby \
                  ruby-i18n \
                  ruby-minitest \
                  ruby-tzinfo \
                  ruby-zeitwerk"

SRC_URI[md5sum] = "4ae3d00c239ba8419b4a27cd995a2245"
SRC_URI[sha256sum] = "9b90aa8ab328692a7b56a94d916811a0bf6a6810f2e11ce67f6b05c89c60d4dd"

GEM_NAME = "activesupport"

inherit rubygems
