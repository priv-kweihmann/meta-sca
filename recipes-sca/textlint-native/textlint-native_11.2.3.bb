SUMMARY = "The pluggable natural language linter for text and markdown."
DESCRIPTION = "The pluggable natural language linter for text and markdown."
HOMEPAGE = "https://github.com/textlint/textlint"

SRC_URI = "file://textlint.sca.description \
           file://textlint.sca.score"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

do_configure[noexec] = "1"

FILES_${PN} = "${datadir}/"

inherit native
inherit npm-helper

python do_compile() {
    import os
    import json

    # npm --prefix . install textlint@11.2.3
    # npm --prefix . install textlint-rule-no-todo@2.0.1
    # npm --prefix . install textlint-rule-no-start-duplicated-conjunction@2.0.2
    # npm --prefix . install textlint-rule-max-number-of-lines@1.0.3
    # npm --prefix . install textlint-rule-max-comma@1.0.4
    # npm --prefix . install textlint-rule-no-exclamation-question-mark@1.0.2
    # npm --prefix . install textlint-rule-ng-word@1.0.0
    # npm --prefix . install textlint-rule-no-dead-link@4.4.1
    # npm --prefix . install textlint-rule-no-empty-section@1.1.0
    # npm --prefix . install textlint-rule-unexpanded-acronym@1.2.3
    # npm --prefix . install textlint-rule-alex@1.3.1
    # npm --prefix . install textlint-rule-write-good@latest
    # npm --prefix . install textlint-rule-rousseau@1.4.5
    # npm --prefix . install textlint-rule-en-max-word-count@1.0.2
    # npm --prefix . install textlint-filter-rule-comments@1.2.2
    # npm --prefix . install textlint-plugin-html@0.2.0
    # npm --prefix . install textlint-plugin-rst@latest
    # npm --prefix . install textlint-rule-date-weekday-mismatch@1.0.5
    # npm --prefix . install textlint-rule-terminology@1.1.30
    # npm --prefix . install textlint-rule-period-in-list-item@0.3.1
    # npm --prefix . install textlint-rule-no-nfd@1.0.1
    # npm --prefix . install @textlint-rule/textlint-rule-no-invalid-control-character@1.2.0
    # npm --prefix . install textlint-rule-no-surrogate-pair@1.0.1
    # npm --prefix . install textlint-rule-abbr-within-parentheses@1.0.2
    # npm --prefix . install textlint-rule-common-misspellings@latest
    # npm --prefix . install textlint-rule-ginger@2.2.1
    # npm --prefix . install textlint-rule-apostrophe@1.0.0
    # npm --prefix . install textlint-rule-diacritics@1.0.0
    # npm --prefix . install textlint-rule-stop-words@1.0.13
    # npm --prefix . install textlint-rule-en-capitalization@2.0.2

    online_pkgs = ["textlint-rule-no-dead-link"]
    plugins = ["textlint-plugin-html", "textlint-plugin-rst"]
    filters = ["textlint-filter-rule-comments"]

    with open(os.path.join(d.getVar("B"), "online-rules.json"), "w") as o:
        json.dump(online_pkgs, o)

    ## Install needed pkgs
    pkgs = {
        "textlint" : "11.2.3",
        "textlint-rule-no-todo" : "2.0.1",
        "textlint-rule-no-start-duplicated-conjunction" : "2.0.2",
        "textlint-rule-max-number-of-lines" : "1.0.3",
        "textlint-rule-max-comma" : "1.0.4",
        "textlint-rule-no-exclamation-question-mark" : "1.0.2",
        "textlint-rule-ng-word" : "1.0.0",
        "textlint-rule-no-dead-link" : "4.4.1",
        "textlint-rule-no-empty-section" : "1.1.0",
        "textlint-rule-unexpanded-acronym" : "1.2.3",
        "textlint-rule-alex" : "1.3.1",
        "textlint-rule-write-good" : "1.6.2",
        "textlint-rule-rousseau" : "1.4.5",
        "textlint-rule-en-max-word-count" : "1.0.2",
        "textlint-filter-rule-comments" : "1.2.2",
        "textlint-plugin-html" : "0.2.0",
        "textlint-plugin-rst" : "0.1.1",
        "textlint-rule-date-weekday-mismatch" : "1.0.5",
        "textlint-rule-terminology" : "1.1.30",
        "textlint-rule-period-in-list-item" : "0.3.1",
        "textlint-rule-no-nfd" : "1.0.1",
        "@textlint-rule/textlint-rule-no-invalid-control-character" : "1.2.0",
        "textlint-rule-no-surrogate-pair" : "1.0.1",
        "textlint-rule-abbr-within-parentheses" : "1.0.2",
        "textlint-rule-common-misspellings" : "1.0.1",
        "textlint-rule-ginger" : "2.2.1",
        "textlint-rule-apostrophe" : "1.0.0",
        "textlint-rule-diacritics" : "1.0.0",
        "textlint-rule-stop-words" : "1.0.13",
        "textlint-rule-en-capitalization" : "2.0.2"
    }


    for name, version in pkgs.items():
        npm_install_package(d, d.getVar("B"), name, version)

    ## Strip of hardcoded paths in packages
    npm_postinst_fix_paths(d, d.getVar("B"), "textlint")
}

INSANE_SKIP_${PN} += "host-user-contaminated"

do_install() {
    mkdir -p ${D}${datadir}/textlint/
    cp -Ra ${B}/* ${D}${datadir}/textlint
    install ${WORKDIR}/textlint.sca.description ${D}${datadir}
    install ${WORKDIR}/textlint.sca.score ${D}${datadir}
}

