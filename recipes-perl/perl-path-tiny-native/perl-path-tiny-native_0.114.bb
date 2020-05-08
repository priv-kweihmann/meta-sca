SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a801633f1c5bd3f1f7aa60bc72e95df9"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "dd6092293f8766fb87d003dceebe4263"
SRC_URI[sha256sum] = "cd0f88f37a58fc3667ec065767fe01e73ee6efa18a112bfd3508cf6579ca00e1"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit native
inherit cpan
