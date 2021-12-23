SUMMARY = "Read/Write .ini style files with as little code as possible"
HOMEPAGE = "https://metacpan.org/pod/Config::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab27c3cedbdb0eb6e656a8722476191a"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RS/RSAVAGE/Config-Tiny-${PV}.tgz"

SRC_URI[md5sum] = "72e70dd180451a06d1baf9676ae0cc77"
SRC_URI[sha256sum] = "38b01b7014223a2890acdb84d67b08bfd6ddbd91b34e0de613b87cd961e0629d"

S = "${WORKDIR}/Config-Tiny-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
