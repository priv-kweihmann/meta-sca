SUMMARY = "A wrapper for perl's configuration"
HOMEPAGE = "https://metacpan.org/pod/ExtUtils::Config"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ddb4d526cd95b017e23486893490883e"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-Config-${PV}.tar.gz"

SRC_URI[md5sum] = "f455b5743db7b73c80e88133effa3551"
SRC_URI[sha256sum] = "82e7e4e90cbe380e152f5de6e3e403746982d502dd30197a123652e46610c66d"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/ExtUtils-Config-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native
