SUMMARY = "Inheritable, overridable class data"
HOMEPAGE = "https://metacpan.org/pod/Class::Data::Inheritable"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=100;endline=105;md5=72bfdf715eed477210669ee3f23ad19a"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TM/TMTM/Class-Data-Inheritable-${PV}.tar.gz"

SRC_URI[md5sum] = "fc0fe65926eb8fb932743559feb54eb9"
SRC_URI[sha256sum] = "9967feceea15227e442ec818723163eb6d73b8947e31f16ab806f6e2391af14a"

S = "${WORKDIR}/Class-Data-Inheritable-${PV}"

inherit cpan
inherit native
