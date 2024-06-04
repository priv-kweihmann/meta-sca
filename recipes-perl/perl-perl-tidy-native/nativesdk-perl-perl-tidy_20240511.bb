SUMMARY = "Parses and beautifies perl source"
HOMEPAGE = "https://metacpan.org/pod/Perl::Tidy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-${PV}.tar.gz"

SRC_URI[sha256sum] = "47ff9e8ce98b5a43dc2d9ce4f02b9af3f4824a5fd912473edc9c16dc595468f2"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Perl-Tidy-${PV}"

inherit cpan
inherit_defer nativesdk
