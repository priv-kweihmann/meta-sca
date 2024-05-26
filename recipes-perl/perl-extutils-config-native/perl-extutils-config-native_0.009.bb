SUMMARY = "A wrapper for perl's configuration"
HOMEPAGE = "https://metacpan.org/pod/ExtUtils::Config"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ddb4d526cd95b017e23486893490883e"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-Config-${PV}.tar.gz"

SRC_URI[md5sum] = "4333113089815c2aa92573b151bb43cb"
SRC_URI[sha256sum] = "4ef84e73aad50a3be332885d2a3b12f3cab1b1e0bad24e88297a123b4f39f3ce"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/ExtUtils-Config-${PV}"

inherit cpan
inherit_defer native
