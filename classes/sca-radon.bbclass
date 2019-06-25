SCA_RADON_ERROR_cc_max_gt ?= "30.0"
SCA_RADON_WARN_cc_max_gt ?= "15.0"

# possible entries for variables are 
# blank_lines_max - Lines with no content max
# blank_lines_mean - Lines with no content mean
# blank_lines_median - Lines with no content median
# blank_lines_min - Lines with no content min
# blank_lines_sd - Lines with no content standard deviation
# blank_lines_sum - Lines with no content overall sum
# cc_max - Cyclomatic complexity max
# cc_mean - Cyclomatic complexity mean
# cc_median - Cyclomatic complexity median
# cc_min - Cyclomatic complexity min
# cc_sd - Cyclomatic complexity standard deviation
# cc_sum - Cyclomatic complexity overall sum
# comments_max - comments max
# comments_mean - comments mean
# comments_median - comments median
# comments_min - comments min
# comments_sd - comments standard deviation
# comments_sum - comments overall sum
# halstaed_bugs_max - Halstaed bug probability max
# halstaed_bugs_mean - Halstaed bug probability mean
# halstaed_bugs_median - Halstaed bug probability median
# halstaed_bugs_min - Halstaed bug probability min
# halstaed_bugs_sd - Halstaed bug probability standard deviation
# halstaed_bugs_sum - Halstaed bug probability overall sum
# halstaed_calc_length_max - Halstaed calculated length max
# halstaed_calc_length_mean - Halstaed calculated length mean
# halstaed_calc_length_median - Halstaed calculated length median
# halstaed_calc_length_min - Halstaed calculated length min
# halstaed_calc_length_sd - Halstaed calculated length standard deviation
# halstaed_calc_length_sum - Halstaed calculated length overall sum
# halstaed_difficulty_max - Halstaed difficulty max
# halstaed_difficulty_mean - Halstaed difficulty mean
# halstaed_difficulty_median - Halstaed difficulty median
# halstaed_difficulty_min - Halstaed difficulty min
# halstaed_difficulty_sd - Halstaed difficulty standard deviation
# halstaed_difficulty_sum - Halstaed difficulty overall sum
# halstaed_dist_operands_max - Halstaed number of distinct operands max
# halstaed_dist_operands_mean - Halstaed number of distinct operands mean
# halstaed_dist_operands_median - Halstaed number of distinct operands median
# halstaed_dist_operands_min - Halstaed number of distinct operands min
# halstaed_dist_operands_sd - Halstaed number of distinct operands standard deviation
# halstaed_dist_operands_sum - Halstaed number of distinct operands overall sum
# halstaed_dist_operators_max - Halstaed number of distinct operators max
# halstaed_dist_operators_mean - Halstaed number of distinct operators mean
# halstaed_dist_operators_median - Halstaed number of distinct operators median
# halstaed_dist_operators_min - Halstaed number of distinct operators min
# halstaed_dist_operators_sd - Halstaed number of distinct operators standard deviation
# halstaed_dist_operators_sum - Halstaed number of distinct operators overall sum
# halstaed_effort_max - Halstaed effort max
# halstaed_effort_mean - Halstaed effort mean
# halstaed_effort_median - Halstaed effort median
# halstaed_effort_min - Halstaed effort min
# halstaed_effort_sd - Halstaed effort standard deviation
# halstaed_effort_sum - Halstaed effort overall sum
# halstaed_length_max - Halstaed length max
# halstaed_length_mean - Halstaed length mean
# halstaed_length_median - Halstaed length median
# halstaed_length_min - Halstaed length min
# halstaed_length_sd - Halstaed length standard deviation
# halstaed_length_sum - Halstaed length overall sum
# halstaed_time_max - Halstaed time max
# halstaed_time_mean - Halstaed time mean
# halstaed_time_median - Halstaed time median
# halstaed_time_min - Halstaed time min
# halstaed_time_sd - Halstaed time standard deviation
# halstaed_time_sum - Halstaed time overall sum
# halstaed_total_operands_max - Halstaed total number of operands max
# halstaed_total_operands_mean - Halstaed total number of operands mean
# halstaed_total_operands_median - Halstaed total number of operands median
# halstaed_total_operands_min - Halstaed total number of operands min
# halstaed_total_operands_sd - Halstaed total number of operands standard deviation
# halstaed_total_operands_sum - Halstaed total number of operands overall sum
# halstaed_total_operators_max - Halstaed total number of operators max
# halstaed_total_operators_mean - Halstaed total number of operators mean
# halstaed_total_operators_median - Halstaed total number of operators median
# halstaed_total_operators_min - Halstaed total number of operators min
# halstaed_total_operators_sd - Halstaed total number of operators standard deviation
# halstaed_total_operators_sum - Halstaed total number of operators sum
# halstaed_vocabulary_max - Halstaed vocabulary max
# halstaed_vocabulary_mean - Halstaed vocabulary mean
# halstaed_vocabulary_median - Halstaed vocabulary median
# halstaed_vocabulary_min - Halstaed vocabulary min
# halstaed_vocabulary_sd - Halstaed vocabulary standard deviation
# halstaed_vocabulary_sum - Halstaed vocabulary overall sum
# halstaed_volume_max - Halstaed volume max
# halstaed_volume_mean - Halstaed volume mean
# halstaed_volume_median - Halstaed volume median
# halstaed_volume_min - Halstaed volume min
# halstaed_volume_sd - Halstaed volume standard deviation 
# halstaed_volume_sum - Halstaed volume overall sum
# lloc_max - Logical Lines of Code max
# lloc_mean - Logical Lines of Code mean
# lloc_median - Logical Lines of Code median
# lloc_min - Logical Lines of Code min
# lloc_sd - Logical Lines of Code standard deviation
# lloc_sum - Logical Lines of Code overall sum
# loc_max - Lines of Code max
# loc_mean - Lines of Code mean
# loc_median - Lines of Code median
# loc_min - Lines of Code min
# loc_sd - Lines of Code standard deviation
# loc_sum - Lines of Code overall sum
# maint_index_max - Maintenance index max
# maint_index_mean - Maintenance index mean
# maint_index_median - Maintenance index median
# maint_index_min - Maintenance index min
# maint_index_sd - Maintenance index standard deviation
# maint_index_sum - Maintenance index overall sum
# multiline_strings_max - Multi-line strings max
# multiline_strings_mean - Multi-line strings mean
# multiline_strings_median - Multi-line strings median
# multiline_strings_min - Multi-line strings min
# multiline_strings_sd - Multi-line strings standard deviation
# multiline_strings_sum - Multi-line strings overall sum
# singleline_comments_max - Single-line comments max
# singleline_comments_mean - Single-line comments mean
# singleline_comments_median - Single-line comments median
# singleline_comments_min - Single-line comments min
# singleline_comments_sd - Single-line comments standard deviation
# singleline_comments_sum - Single-line comments overall sum

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper

def calc_min_max(d, _in):
    import statistics
    if not _in:
        _in = [0, 0]
    elif len(_in) < 2:
        _in.append(0)
    return [sum(_in), min(_in), statistics.mean(_in), statistics.median(_in), max(_in), statistics.stdev(_in)]

def set_min_max(d, res, prefix, _in):
    x = calc_min_max(d, _in)
    suffixes = ["sum", "min", "mean", "median", "max", "sd"]
    for y in suffixes:
        res["{}_{}".format(prefix, y)] = x[suffixes.index(y)]
    return res

def do_sca_conv_radon(d):
    import os
    import re
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _suppress = get_suppress_entries(d)

    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        j = {}
        with open(d.getVar("SCA_RAW_RESULT_FILE")) as i:
            j = json.load(i)
        ## Calculate the metrics first (per file)
        result = {}

        ## halstead
        for k,v in j["hal"].items():
            if not k in result:
                result[k] = {}
            if not "functions" in v:
                continue                
            result[k] = set_min_max(d, result[k], "halstaed_dist_operators",  [x[1][0] for x in  v["functions"]])
            result[k] = set_min_max(d, result[k], "halstaed_dist_operands",   [x[1][1] for x in  v["functions"]])
            result[k] = set_min_max(d, result[k], "halstaed_total_operators", [x[1][2] for x in  v["functions"]])
            result[k] = set_min_max(d, result[k], "halstaed_total_operands",  [x[1][3] for x in  v["functions"]])
            result[k] = set_min_max(d, result[k], "halstaed_vocabulary",      [x[1][4] for x in  v["functions"]])
            result[k] = set_min_max(d, result[k], "halstaed_length",          [x[1][5] for x in  v["functions"]])
            result[k] = set_min_max(d, result[k], "halstaed_calc_length",     [x[1][6] for x in  v["functions"]])
            result[k] = set_min_max(d, result[k], "halstaed_volume",          [x[1][7] for x in  v["functions"]])
            result[k] = set_min_max(d, result[k], "halstaed_difficulty",      [x[1][8] for x in  v["functions"]])
            result[k] = set_min_max(d, result[k], "halstaed_effort",          [x[1][9] for x in  v["functions"]])
            result[k] = set_min_max(d, result[k], "halstaed_time",            [x[1][10] for x in v["functions"]])
            result[k] = set_min_max(d, result[k], "halstaed_bugs",            [x[1][11] for x in v["functions"]])

        ## raw
        for k,v in j["raw"].items():
            if not k in result:
                result[k] = {}
            result[k] = set_min_max(d, result[k], "loc",                  [y for x,y in v.items() if "loc" == x])
            result[k] = set_min_max(d, result[k], "lloc",                 [y for x,y in v.items() if "lloc" == x])
            result[k] = set_min_max(d, result[k], "comments",             [y for x,y in v.items() if "comments" == x])
            result[k] = set_min_max(d, result[k], "multiline_strings",    [y for x,y in v.items() if "multi" == x])
            result[k] = set_min_max(d, result[k], "blank_lines",          [y for x,y in v.items() if "blank" == x])
            result[k] = set_min_max(d, result[k], "singleline_comments",  [y for x,y in v.items() if "single_comments" == x])

        ## mi
        for k,v in j["mi"].items():
            if not k in result:
                result[k] = {}
            if not "mi" in v:
                continue
            result[k] = set_min_max(d, result[k], "maint_index",          [v["mi"], v["mi"]])

        ## cc
        for k,v in j["cc"].items():
            if not k in result:
                result[k] = {}
            result[k] = set_min_max(d, result[k], "cc", [x["complexity"] for x in v if "complexity" in x])      

        try:
            for k,v in result.items():
                for ik, iv in v.items():
                    ## lt error
                    if d.getVar("SCA_RADON_ERROR_{}_lt".format(ik)):
                        val = float(d.getVar("SCA_RADON_ERROR_{}_lt".format(ik)))
                        if iv < val:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="radon",
                                                    BuildPath=buildpath,
                                                    File=k,
                                                    Message="value {} is {}<{}".format(ik, iv, val),
                                                    ID=ik,
                                                    Severity="error")
                            if ik in _suppress:
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                sca_add_model_class(d, g)
                    if d.getVar("SCA_RADON_ERROR_{}_gt".format(ik)):
                        val = float(d.getVar("SCA_RADON_ERROR_{}_gt".format(ik)))
                        if iv > val:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="radon",
                                                    BuildPath=buildpath,
                                                    File=k,
                                                    Message="value {} is {}>{}".format(ik, iv, val),
                                                    ID=ik,
                                                    Severity="error")
                            if ik in _suppress:
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                sca_add_model_class(d, g)
                    if d.getVar("SCA_RADON_WARN_{}_lt".format(ik)):
                        val = float(d.getVar("SCA_RADON_WARN_{}_lt".format(ik)))
                        if iv < val:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="radon",
                                                    BuildPath=buildpath,
                                                    File=k,
                                                    Message="value {} is {}<{}".format(ik, iv, val),
                                                    ID=ik,
                                                    Severity="warning")
                            if ik in _suppress:
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                sca_add_model_class(d, g)
                    if d.getVar("SCA_RADON_WARN_{}_gt".format(ik)):
                        val = float(d.getVar("SCA_RADON_WARN_{}_gt".format(ik)))
                        if iv > val:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="radon",
                                                    BuildPath=buildpath,
                                                    File=k,
                                                    Message="value {} is {}>{}".format(ik, iv, val),
                                                    ID=ik,
                                                    Severity="warning")
                            if ik in _suppress:
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                sca_add_model_class(d, g)
        except Exception as e:
            bb.warn(str(e))

    return sca_save_model_to_string(d)

python do_sca_radon() {
    import os
    import subprocess
    import json
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_RADON_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_RADON_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "radon-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "radon-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["radon"]

    ## Run
    json_output = {}
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_radon.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    _files = get_files_by_extention_or_shebang(d, 
                                    d.getVar("SCA_SOURCES_DIR"),
                                    ".*python3",
                                    [ ".py" ], 
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    _header = []
    if any(_files):
        cmd_output = ""
        for mod in ["raw", "cc", "mi", "hal"]:
            try:
                cmd_output = subprocess.check_output(_args + [mod, "--json"] +_files, universal_newlines=True, stderr=subprocess.STDOUT)
            except subprocess.CalledProcessError as e:
                cmd_output = e.stdout or ""
            try:
                json_output[mod] = json.loads(cmd_output)
            except json.JSONDecodeError:
                json_output[mod] = {}
        
    with open(tmp_result, "w") as o:
        json.dump(json_output, o, indent=4)
    
    # Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/radon.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_radon(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "radon", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_radon"

python do_sca_deploy_radon() {
    sca_conv_deploy(d, "radon", "json")
}

addtask do_sca_radon before do_install after do_compile
addtask do_sca_deploy_radon after do_sca_radon before do_package

DEPENDS += "${SCA_STD_PYTHON_INTERPRETER}-radon-native sca-recipe-radon-rules-native"
