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

SRC_URI[md5sum] = "035ebb4d7f369197d6e625ebdd746d22"
SRC_URI[sha256sum] = "8ea98f042e747f76837137f8b2bd1c927fc6009f873ff6e49cb5dd652b8a3499"

GEM_NAME = "google-apis-generator"

inherit rubygems
