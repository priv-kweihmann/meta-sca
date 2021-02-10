SUMMARY = "automatically give your module the ability to have plugins"
HOMEPAGE = "https://metacpan.org/pod/Module::Pluggable"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=323;endline=326;md5=a63e0dc94502aefcfbb9b75598561357"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SI/SIMONW/Module-Pluggable-${PV}.tar.gz"

SRC_URI[md5sum] = "87ce2971662efd0b69a81bb4dc9ea76c"
SRC_URI[sha256sum] = "b3f2ad45e4fd10b3fb90d912d78d8b795ab295480db56dc64e86b9fa75c5a6df"

S = "${WORKDIR}/Module-Pluggable-${PV}"

inherit cpan
inherit native
