## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global

python sca_image_summary_init() {
    for item in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        for taskstr in ["do_sca_deploy_{}".format(item), "do_sca_deploy_{}_image".format(item)]:
            task = d.getVar(taskstr, False)
            if task is not None:
                d.appendVarFlag("do_sca_image_summary", "depends", " {}:{}".format(d.getVar("PN"), taskstr))
}

python do_sca_image_summary() {
    import json

    imgsum = []
    _json = {}
    with open(d.getVar("SCA_IMAGE_PKG_LIST")) as i:
        _json = json.load(i)

    for rpm, v in _json.items():
        for mod in d.getVar("SCA_AVAILABLE_MODULES"):
            fp = os.path.join(d.getVar("SCA_EXPORT_DIR"), mod, "datamodel", "{}-{}.dm".format(rpm, v["ver"]))
            if os.path.exists(fp):
                imgsum += sca_get_datamodel(d, fp)
    for mod in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        fp = os.path.join(d.getVar("T"), "{}.dm".format(mod))
        if os.path.exists(fp):
            imgsum += sca_get_datamodel(d, fp)

    ## Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/image-summary.dm".format(d.getVar("T")))
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(sca_save_model_to_string(d, model=imgsum))

    sca_task_aftermath(d, "image-summary", [])
}

SCA_DEPLOY_TASK = "do_sca_deploy_image_summary"

python do_sca_deploy_image_summary() {
    sca_conv_deploy(d, "image-summary", "notexists")
}

do_image[postfuncs] += "do_sca_image_summary"
do_image_complete[prefuncs] += "do_sca_deploy_image_summary"

do_sca_image_summary[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_image_summary[nostamp] = "${@sca_force_run(d)}"
