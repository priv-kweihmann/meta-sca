SUMMARY = "Bloaty McBloatface: a size profiler for binaries"
HOMEPAGE = "https://github.com/google/bloaty"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "\
            protobuf-native \
            "

SRC_URI = "git://github.com/google/bloaty.git"
SRCREV = "7cf6c58688ca756147896d7bc2aaf96988e45d3b"

S = "${WORKDIR}/git"

UPSTREAM_CHECK_COMMITS = "1"

inherit native
inherit cmake
