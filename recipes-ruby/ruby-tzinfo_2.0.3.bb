SUMMARY = "RubyGem: tzinfo"
DESCRIPTION = "TZInfo provides access to time zone data and allows times to be converted using time zone rules."
HOMEPAGE = "https://tzinfo.github.io"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7a23b7bc3769392321d91780fe51a4e"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-concurrent-ruby"

SRC_URI[md5sum] = "f32937d3d96a941552a0d1e8a1fdcdad"
SRC_URI[sha256sum] = "6f1705dd3ca4cf21fbdd1abdea8338334ef115df2e33e42a8f791b19db9765ab"

GEM_NAME = "tzinfo"

inherit rubygems
