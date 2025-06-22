SUMMARY = "The leading static analyzer for Perl. Configurable, extensible, powerful"
HOMEPAGE = "https://github.com/Perl-Critic/Perl-Critic"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-1.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7aeaba565e72805da904a73fdc467406"

DEPENDS += "\
    libmodule-build-perl-native \
    nativesdk-perl \
    nativesdk-perl-class-data-inheritable \
    nativesdk-perl-config-tiny \
    nativesdk-perl-devel-stacktrace \
    nativesdk-perl-exception-class \
    nativesdk-perl-file-spec \
    nativesdk-perl-file-which \
    nativesdk-perl-io-string \
    nativesdk-perl-list-utils \
    nativesdk-perl-module-pluggable \
    nativesdk-perl-perl-tidy \
    nativesdk-perl-pod-parser \
    nativesdk-perl-pod-shell \
    nativesdk-perl-ppi \
    nativesdk-perl-ppix-quotelike \
    nativesdk-perl-ppix-regexp \
    nativesdk-perl-ppix-utilities \
    nativesdk-perl-readonly \
    nativesdk-perl-safe-isa \
    nativesdk-perl-string-format \
    nativesdk-perl-task-weaken \
    nativesdk-perl-term-ansicolor \
    nativesdk-perl-test-deep \
    nativesdk-perl-text-parsewords \
    nativesdk-perl-yaml-pp \
    perl-b-keywords-native \
    perl-exporter-tiny-native \
    perl-list-moreutils-native \
"

SRC_URI = "git://github.com/Perl-Critic/Perl-Critic.git;branch=master;protocol=https"
SRCREV = "47c8115b82f47bd27cba1af2f200694e69a1ef14"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>1\.\d{3})"

inherit cpan_build
inherit sca-description
inherit_defer nativesdk

SCA_TOOL_DESCRIPTION = "perlcritic"

do_compile () {
    perl Build verbose=1
}

do_install:append() {
    sed -i "s#/.*/bin/perl#/usr/bin/env perl#g" ${D}${bindir}/perlcritic
    # Remove .packlist file, as it contains host specific paths
    # and doesn't serve a real purpose
    find ${D} -name ".packlist" -delete
}

INSANE_SKIP:${PN} += "shebang-size"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-perl \
    nativesdk-perl-class-data-inheritable \
    nativesdk-perl-config-tiny \
    nativesdk-perl-devel-stacktrace \
    nativesdk-perl-exception-class \
    nativesdk-perl-file-spec \
    nativesdk-perl-file-which \
    nativesdk-perl-io-string \
    nativesdk-perl-list-utils \
    nativesdk-perl-module-pluggable \
    nativesdk-perl-perl-tidy \
    nativesdk-perl-pod-parser \
    nativesdk-perl-pod-shell \
    nativesdk-perl-ppi \
    nativesdk-perl-ppix-quotelike \
    nativesdk-perl-ppix-regexp \
    nativesdk-perl-ppix-utilities \
    nativesdk-perl-readonly \
    nativesdk-perl-string-format \
    nativesdk-perl-task-weaken \
    nativesdk-perl-term-ansicolor \
    nativesdk-perl-test-deep \
    nativesdk-perl-text-parsewords \
"
