SUMMARY = "an exporter with the features of Sub::Exporter but only core dependencies"
HOMEPAGE = "https://metacpan.org/pod/Exporter::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=622025314d222840baccc6f37e119800"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Exporter-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "df9686bd6b01521b08b63fdaebdd388e"
SRC_URI[sha256sum] = "8f5cc0a672339bca89120b4d77083dab9f0f05eb64f788add9bc2ae35324da78"

S = "${WORKDIR}/Exporter-Tiny-${PV}"

inherit cpan
inherit native
