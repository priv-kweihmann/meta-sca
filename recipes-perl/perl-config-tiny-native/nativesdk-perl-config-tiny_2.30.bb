SUMMARY = "Read/Write .ini style files with as little code as possible"
HOMEPAGE = "https://metacpan.org/pod/Config::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab27c3cedbdb0eb6e656a8722476191a"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RS/RSAVAGE/Config-Tiny-${PV}.tgz"

SRC_URI[md5sum] = "b497217a7b7f41007ce215c3d47ad7a1"
SRC_URI[sha256sum] = "b2f7345619b3b8e636dd39ea010731c9dc2bfb8f022bcbd86ae6ad17866e110d"

S = "${WORKDIR}/Config-Tiny-${PV}"

inherit cpan
inherit nativesdk
