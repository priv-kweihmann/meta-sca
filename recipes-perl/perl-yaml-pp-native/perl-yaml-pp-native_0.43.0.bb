SUMMARY = "YAML 1.2 processor"
HOMEPAGE = "https://metacpan.org/pod/YAML::PP"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Artistic-1.0 AND GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=caf164c91bbe352c93c632d2ef0e3755"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TINITA/YAML-PP-v${PV}.tar.gz"

SRC_URI[sha256sum] = "f4a2a6d22b32a31e418debcbd04b843ba0997f9dea0fcc1f96b08b2f2ebcb2e7"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/YAML-PP-v${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native

UPSTREAM_CHECK_REGEX = "YAML-PP-v(?P<pver>\d+.\d+(.\d+)*).tar.gz"
