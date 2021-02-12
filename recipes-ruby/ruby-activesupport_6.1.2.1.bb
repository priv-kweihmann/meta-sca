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

SRC_URI[md5sum] = "86ec790a2a10eedf3a704d43a7c04a0d"
SRC_URI[sha256sum] = "7155b715636faa2970123501f2356d3dc7390dcd9f2f9cb455f91e5d5b4ee250"

GEM_NAME = "activesupport"

inherit rubygems
