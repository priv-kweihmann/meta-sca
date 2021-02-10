SUMMARY = "sca definition for textlint"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "\
            npm-textlint-filter-rule-comments-native \
            npm-textlint-native \
            npm-textlint-plugin-html-native \
            npm-textlint-plugin-rst-native \
            npm-textlint-rule-abbr-within-parentheses-native \
            npm-textlint-rule-alex-native \
            npm-textlint-rule-apostrophe-native \
            npm-textlint-rule-common-misspellings-native \
            npm-textlint-rule-date-weekday-mismatch-native \
            npm-textlint-rule-diacritics-native \
            npm-textlint-rule-en-capitalization-native \
            npm-textlint-rule-en-max-word-count-native \
            npm-textlint-rule-ginger-native \
            npm-textlint-rule-helper-native \
            npm-textlint-rule-max-comma-native \
            npm-textlint-rule-max-number-of-lines-native \
            npm-textlint-rule-ng-word-native \
            npm-textlint-rule-no-dead-link-native \
            npm-textlint-rule-no-empty-section-native \
            npm-textlint-rule-no-exclamation-question-mark-native \
            npm-textlint-rule-no-nfd-native \
            npm-textlint-rule-no-start-duplicated-conjunction-native \
            npm-textlint-rule-no-surrogate-pair-native \
            npm-textlint-rule-no-todo-native \
            npm-textlint-rule-period-in-list-item-native \
            npm-textlint-rule-rousseau-native \
            npm-textlint-rule-stop-words-native \
            npm-textlint-rule-terminology-native \
            npm-textlint-rule-textlint-rule-no-invalid-control-character-native \
            npm-textlint-rule-unexpanded-acronym-native \
            npm-textlint-rule-write-good-native \
            "

SRC_URI = "file://textlint.sca.description"

inherit sca-description
inherit native

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/textlint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
