SUMMARY = "The leading static analyzer for Perl. Configurable, extensible, powerful"
HOMEPAGE = "https://github.com/Perl-Critic/Perl-Critic"

LICENSE = "GPL-1.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7aeaba565e72805da904a73fdc467406"

DEPENDS += "\
            libmodule-build-perl-native \
            perl-b-keywords-native \
            perl-class-data-inheritable-native \
            perl-config-tiny-native \
            perl-devel-stacktrace-native \
            perl-exception-class-native \
            perl-exporter-tiny-native \
            perl-file-spec-native \
            perl-file-which-native \
            perl-io-string-native \
            perl-list-moreutils-native \
            perl-list-utils-native \
            perl-module-pluggable-native \
            perl-native \
            perl-perl-tidy-native \
            perl-pod-shell-native \
            perl-pod-parser-native \
            perl-ppi-native \
            perl-ppix-quotelike-native \
            perl-ppix-regexp-native \
            perl-ppix-utilities-native \
            perl-readonly-native \
            perl-string-format-native \
            perl-task-weaken-native \
            perl-term-ansicolor-native \
            perl-test-deep-native \
            perl-text-parsewords-native \
            "

SRC_URI = "git://github.com/Perl-Critic/Perl-Critic.git;protocol=https \
           file://perlcritic.sca.description"
SRCREV = "47c8115b82f47bd27cba1af2f200694e69a1ef14"
S = "${WORKDIR}/git"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>1\.\d{3})"

inherit cpan_build
inherit sca-description
inherit native

do_compile () {
    perl Build verbose=1
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/perlcritic.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
