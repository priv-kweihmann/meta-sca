SUMMARY = "RubyGem: json"
DESCRIPTION = "This is a JSON implementation as a Ruby extension in C."
HOMEPAGE = "http://flori.github.io/json/"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8a960b08d972f43f91ae84a6f00dcbfb"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "b764eca5d536f6d80148baad481af6c3"
SRC_URI[sha256sum] = "601ca653b508882b402c06d2ad47269457b3acea26a6108c6fbe7161cdb454f2"

GEM_NAME = "json"

inherit rubygems
