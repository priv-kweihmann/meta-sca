SUMMARY = "Read/Write .ini style files with as little code as possible"
HOMEPAGE = "https://metacpan.org/pod/Config::Tiny"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab27c3cedbdb0eb6e656a8722476191a"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RS/RSAVAGE/Config-Tiny-${PV}.tgz"

SRC_URI[md5sum] = "760485706daa91a22485421c3c2b1e1d"
SRC_URI[sha256sum] = "83b53291baec7884fbdfeb2a231297202df266cac58638b895ce25ec877dcf5f"

S = "${WORKDIR}/Config-Tiny-${PV}"

inherit native
inherit cpan
