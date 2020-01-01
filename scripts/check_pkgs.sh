#! /bin/sh
# This script should check all non-github/pypi packages
# If there are updates available

PKGS="\
        checkbashism-native \
        libtalloc-native \
        perl-b-keywords-native \
        perl-class-data-inheritable-native \
        perl-class-inspector-native \
        perl-class-tiny-native \
        perl-clone-native \
        perl-config-tiny-native \
        perl-devel-stacktrace-native \
        perl-en-lingua-inflect-native \
        perl-exception-class-native \
        perl-exporter-tiny-native \
        perl-extutils-config-native \
        perl-extutils-helper-native \
        perl-extutils-installpaths-native \
        perl-file-sharedir-install-native \
        perl-file-sharedir-native \
        perl-file-spec-native \
        perl-file-which-native \
        perl-io-string-native \
        perl-list-moreutils-native \
        perl-list-utils-native \
        perl-module-build-tiny-native \
        perl-module-pluggable-native \
        perl-params-util-native \
        perl-path-tiny-native \
        perl-perl-tidy-native \
        perl-pod-shell-native \
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
        python-cffi-native \
        python-enum34-native \
        python-polib-native \
        python-ruamelyaml-native \
        shellcheck-native \
        sparse-native \
        tiger-native \
      "

for p in ${PKGS}; do
    devtool check-upgrade-status ${p} 2>&1 | grep "INFO:"
done
