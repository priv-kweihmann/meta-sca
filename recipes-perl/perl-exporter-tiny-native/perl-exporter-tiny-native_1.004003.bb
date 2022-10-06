SUMMARY = "an exporter with the features of Sub::Exporter but only core dependencies"
HOMEPAGE = "https://metacpan.org/pod/Exporter::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=622025314d222840baccc6f37e119800"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Exporter-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "da563e44a0725230baa57bc18ac4bd8f"
SRC_URI[sha256sum] = "7c6852f18367af05f03912f007a1fac318471a870a457f0e502c11adcf9a457b"

S = "${WORKDIR}/Exporter-Tiny-${PV}"

inherit cpan
inherit native
