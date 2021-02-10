SUMMARY = "Various portability utilities for module builders"
HOMEPAGE = "https://metacpan.org/pod/ExtUtils::Helpers"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=223c04045664f72c3a6556462612bddd"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-Helpers-${PV}.tar.gz"

SRC_URI[md5sum] = "83b00c1e401321c425ae5db6b2b2fd12"
SRC_URI[sha256sum] = "de901b6790a4557cf4ec908149e035783b125bf115eb9640feb1bc1c24c33416"

S = "${WORKDIR}/ExtUtils-Helpers-${PV}"

inherit cpan
inherit native
