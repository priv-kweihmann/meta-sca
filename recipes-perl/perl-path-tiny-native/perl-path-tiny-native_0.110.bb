SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "da6316a7b9e4fd747cf98c11be95f630"
SRC_URI[sha256sum] = "a849dc0777315899689d0b351e815d90eaa636a01ed1d5e6de99a368529b5cfa"

S = "${WORKDIR}/Path-Tiny-${PV}"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://LICENSE;md5=a801633f1c5bd3f1f7aa60bc72e95df9"

inherit native
inherit cpan
