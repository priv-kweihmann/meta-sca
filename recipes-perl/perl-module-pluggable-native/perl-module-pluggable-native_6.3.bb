SUMMARY = "automatically give your module the ability to have plugins"
HOMEPAGE = "https://metacpan.org/pod/Module::Pluggable"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=323;endline=326;md5=a63e0dc94502aefcfbb9b75598561357"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SI/SIMONW/Module-Pluggable-${PV}.tar.gz"

SRC_URI[md5sum] = "442bb8838a2b7053aa276a41233b0607"
SRC_URI[sha256sum] = "58512bb9c654746d0937770b98b559b30872d85ac24073485e5830890dd1b2a0"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Module-Pluggable-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native
