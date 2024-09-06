SUMMARY = "Various portability utilities for module builders"
HOMEPAGE = "https://metacpan.org/pod/ExtUtils::Helpers"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0280160e4f26faafef507664884bf63"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-Helpers-${PV}.tar.gz"

SRC_URI[md5sum] = "0687f20ac896a7d01219646908ccdf89"
SRC_URI[sha256sum] = "c8574875cce073e7dc5345a7b06d502e52044d68894f9160203fcaab379514fe"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/ExtUtils-Helpers-${PV}"

inherit cpan
inherit_defer native
