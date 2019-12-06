SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "1a7fbdccc4585074ce4419b7bec0966c"
SRC_URI[sha256sum] = "3c49482be2b3eb7ddd7e73a5b90cff648393f5d5de334ff126ce7a3632723ff5"

S = "${WORKDIR}/Path-Tiny-${PV}"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://LICENSE;md5=a801633f1c5bd3f1f7aa60bc72e95df9"

inherit native
inherit cpan
