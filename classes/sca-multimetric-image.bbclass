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
    with open(sca_raw_result_file(d, "multimetric"), "w") as o:
        json.dump(res, o)
}

do_sca_multimetric_image[doc] = "Get code metrics for image"
do_sca_deploy_multimetric_image[doc] = "Deploy results of do_sca_multimetric_core"
addtask do_sca_multimetric_core before do_image_complete after do_image
addtask do_sca_multimetric_core_report after do_sca_multimetric_core before do_sca_deploy

DEPENDS += "sca-image-multimetric-rules-native"
