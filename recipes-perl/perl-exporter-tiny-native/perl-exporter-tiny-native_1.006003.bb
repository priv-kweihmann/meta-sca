SUMMARY = "an exporter with the features of Sub::Exporter but only core dependencies"
HOMEPAGE = "https://metacpan.org/pod/Exporter::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=034cf2a8ee38a7a2efaef1e024f5912d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Exporter-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "a70bdc039b12f90191e7c5669b2b55f9"
SRC_URI[sha256sum] = "6499f09a6432cf87b133fb9580a8a9a9a6c566821346b1fdee95f7b64c0317b1"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Exporter-Tiny-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native
