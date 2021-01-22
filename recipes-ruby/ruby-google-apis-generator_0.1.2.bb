SUMMARY = "RubyGem: google-apis-generator"
DESCRIPTION = "Code generator for legacy Google REST clients"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-activesupport \
                  ruby-gems \
                  ruby-google-apis-core \
                  ruby-google-apis-discovery-v1 \
                  ruby-thor"

SRC_URI[md5sum] = "5ce33adfd39e5673fb328d6111b8045b"
SRC_URI[sha256sum] = "9b581981caa3703086a52d4147145f49f2dc6d422b276ca40ef432b84ffab6cc"

GEM_NAME = "google-apis-generator"

inherit rubygems
