SUMMARY = "RubyGem: google-apis-discovery_v1"
DESCRIPTION = "This is the simple REST client for API Discovery Service V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-google-apis-core"

SRC_URI[md5sum] = "931278ce45f35237f8604ca24996e7dd"
SRC_URI[sha256sum] = "0fa659e114f35c2e88ed847f5c129a83deb0cc310cdde687caee66844ea00007"

GEM_NAME = "google-apis-discovery_v1"

inherit rubygems
