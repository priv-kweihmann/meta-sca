SUMMARY = "Simple, compact and correct param-checking functions"
HOMEPAGE = "https://metacpan.org/pod/Params::Util"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b41a38c91c3e99543225495ccf83895d"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AD/ADAMK/Params-Util-${PV}.tar.gz"

SRC_URI[md5sum] = "02db120c0eef87aae1830cc62bdec37b"
SRC_URI[sha256sum] = "30f1ec3f2cf9ff66ae96f973333f23c5f558915bb6266881eac7423f52d7c76c"

S = "${WORKDIR}/Params-Util-${PV}"

inherit cpan
inherit native
