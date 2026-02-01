SUMMARY = "Parses and beautifies perl source"
HOMEPAGE = "https://metacpan.org/pod/Perl::Tidy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-${PV}.tar.gz"

SRC_URI[sha256sum] = "76404514505ba0c768a394d4f28ea0691c8899b049258aa545b7042265e14811"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Perl-Tidy-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native
