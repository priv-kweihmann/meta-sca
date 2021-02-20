SUMMARY = "RubyGem: activesupport"
DESCRIPTION = "A toolkit of support libraries and Ruby core extensions extracted from the Rails framework"
HOMEPAGE = "https://rubyonrails.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=a2e0e281b9b6c47f722da2255eca5d68"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-concurrent-ruby \
                  ruby-i18n \
                  ruby-minitest \
                  ruby-tzinfo \
                  ruby-zeitwerk"

SRC_URI[md5sum] = "237d41781517b485f27b00b180721cfa"
SRC_URI[sha256sum] = "1009ad0f8a8bd3f752b59b25f60bf4dbb59ab115537d68a6f785a347cc6a4401"

GEM_NAME = "activesupport"

inherit rubygems
