SUMMARY = "Read/Write .ini style files with as little code as possible"
HOMEPAGE = "https://metacpan.org/pod/Config::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab27c3cedbdb0eb6e656a8722476191a"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RS/RSAVAGE/Config-Tiny-${PV}.tgz"

SRC_URI[md5sum] = "4210c634e43b5374c56059e3139092ed"
SRC_URI[sha256sum] = "12df843a0d29d48f61bcc14c4f18f0858fd27a8dd829a00319529d654fe01500"

S = "${WORKDIR}/Config-Tiny-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
