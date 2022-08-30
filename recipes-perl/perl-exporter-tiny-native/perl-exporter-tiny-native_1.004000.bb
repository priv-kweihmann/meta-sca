SUMMARY = "an exporter with the features of Sub::Exporter but only core dependencies"
HOMEPAGE = "https://metacpan.org/pod/Exporter::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=622025314d222840baccc6f37e119800"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Exporter-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "998f397261493b8417176fec12b5be67"
SRC_URI[sha256sum] = "7f7b3b4fbe923355317243cd434d2319ffbad81c98cf8c8e189a6943b42bfeca"

S = "${WORKDIR}/Exporter-Tiny-${PV}"

inherit cpan
inherit native
