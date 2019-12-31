## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_MULTIMETRIC_IMAGE_KEY = "mean"
_SCA_MULTIMETRIC_IMAGE_SUBKEY = "\
                                comment_ratio \
                                cyclomatic_complexity \
                                fanout_external \
                                fanout_internal \
                                halstead_bugprop \
                                halstead_difficulty \
                                halstead_effort \
                                halstead_timerequired \
                                halstead_volume \
                                loc \
                                maintainability_index \
                                operands_sum \
                                operands_uniq \
                                operators_sum \
                                operators_uniq \
                                pylint \
                                tiobe_compiler \
                                tiobe_complexity \
                                tiobe_coverage \
                                tiobe_duplication \
                                tiobe_fanout \
                                tiobe_functional \
                                tiobe_security \
                                tiobe_standard \
                                tiobe \
                                "

SCA_MULTIMETRIC_ERROR_maintainability_index_lt ?= "50.0"
SCA_MULTIMETRIC_ERROR_tiobe_lt ?= "50.0"
SCA_MULTIMETRIC_WARN_maintainability_index_lt ?= "80.0"
SCA_MULTIMETRIC_WARN_pylint_lt ?= "70.0"
SCA_MULTIMETRIC_WARN_tiobe_lt ?= "80.0"

inherit sca-multimetric-core

SCA_DEPLOY_TASK = "do_sca_deploy_multimetric_image"

python do_sca_deploy_multimetric_image() {
    sca_conv_deploy(d, "multimetric", "json")
}

python do_sca_multimetric_image() {
    import statistics
    import glob
    import json

    _json = {}
    tmp = []
    with open(d.getVar("SCA_IMAGE_PKG_LIST")) as i:
        _json = json.load(i)
    for rpm, v in _json.items():
        res = glob.glob(os.path.join(d.getVar("SCA_EXPORT_DIR"), "multimetric", "raw", "{}-*.json".format(rpm)))
        if res:
            with open(res[0]) as i:
                try:
                    tmp.append(json.load(i)["stats"][d.getVar("SCA_MULTIMETRIC_IMAGE_KEY")])
                except Exception as e:
                    bb.note(str(e))

    # Create final object
    res = {"files": {d.getVar("FILE"): {}}}
    for key in clean_split(d, "_SCA_MULTIMETRIC_IMAGE_SUBKEY"):
        try:
            res["files"][d.getVar("FILE")][key] = statistics.mean([x[key] for x in tmp])
        except statistics.StatisticsError as e:
            bb.note(str(e))

    # from now on business as usual
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_multimetric.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    with open(tmp_result, "w") as o:
        json.dump(res, o)

    d.setVar("SCA_DATAMODEL_STORAGE", "{}/multimetric.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_multimetric(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "multimetric", get_fatal_entries(d))
}

addtask do_sca_multimetric_image before do_image_complete after do_image
addtask do_sca_deploy_multimetric_image before do_image_complete after do_sca_multimetric_image

do_sca_multimetric_image[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_multimetric_image[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"

DEPENDS += "sca-image-multimetric-rules-native"
