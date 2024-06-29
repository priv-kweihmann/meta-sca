SUMMARY = "Various portability utilities for module builders"
HOMEPAGE = "https://metacpan.org/pod/ExtUtils::Helpers"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0280160e4f26faafef507664884bf63"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-Helpers-${PV}.tar.gz"

SRC_URI[md5sum] = "e7565e30531c2789df610663477c71a6"
SRC_URI[sha256sum] = "9d592131dc5845a86dc28be9143f764e73cb62db06fedf50a895be1324b6cec5"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/ExtUtils-Helpers-${PV}"

inherit cpan
inherit_defer native
