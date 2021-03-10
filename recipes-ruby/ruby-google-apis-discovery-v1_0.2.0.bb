SUMMARY = "RubyGem: google-apis-discovery_v1"
DESCRIPTION = "This is the simple REST client for API Discovery Service V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-google-apis-core"

SRC_URI[md5sum] = "8a61a47c66ecdf6ed8c395903edd9108"
SRC_URI[sha256sum] = "054a5d8988e354f99559c5e419875c22985efb6cf24d0011ac0863bba64c995c"

GEM_NAME = "google-apis-discovery_v1"

inherit rubygems
