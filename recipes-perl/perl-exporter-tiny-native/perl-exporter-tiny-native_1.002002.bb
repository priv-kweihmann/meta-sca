SUMMARY = "an exporter with the features of Sub::Exporter but only core dependencies"
HOMEPAGE = "https://metacpan.org/pod/Exporter::Tiny"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e2c688697749fe6ea6a094eced384110"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Exporter-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "485897322a2514b4d6ca90b2daacb7cd"
SRC_URI[sha256sum] = "00f0b95716b18157132c6c118ded8ba31392563d19e490433e9a65382e707101"

S = "${WORKDIR}/Exporter-Tiny-${PV}"

inherit cpan
inherit native
