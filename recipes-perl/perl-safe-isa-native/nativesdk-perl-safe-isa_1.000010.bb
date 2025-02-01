SUMMARY = "Call isa, can, does and DOES safely on things that may not be objects"
HOMEPAGE = "https://metacpan.org/pod/Safe::Isa"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=147;md5=87e1d51b7bf1b1a730156174d3235554"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Safe-Isa-${PV}.tar.gz"

SRC_URI[sha256sum] = "87f4148aa0ff1d5e652723322eab7dafa3801c967d6f91ac9147a3c467b8a66a"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Safe-Isa-${PV}"

inherit cpan
inherit_defer nativesdk
