SUMMARY = "standard library for Semgrep rules"
HOMEPAGE = "https://github.com/returntocorp/semgrep-rules"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.0-only;md5=9427b8ccf5cf3df47c29110424c9641a"

SRC_URI = "git://github.com/returntocorp/semgrep-rules.git;protocol=https;branch=develop"
SRCREV = "ac980ea67b6573d6c2ed4e4688e1843c4629d908"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}/semgrep/semgrep-rules
    for folder in $(find ${S} -type d -mindepth 1 -maxdepth 1 -not -name ".*" -exec basename {} \;); do
        # skip a few
        [ "$folder" = "java" ] && continue
        [ "$folder" = "kotlin" ] && continue
        [ "$folder" = "ocaml" ] && continue
        [ "$folder" = "terraform" ] && continue
        [ "$folder" = "tests" ] && continue
        [ "$folder" = "typescript" ] && continue
        cp -r ${S}/$folder ${D}${datadir}/semgrep/semgrep-rules/$folder
    done
}

FILES_${PN} = "${datadir}"
