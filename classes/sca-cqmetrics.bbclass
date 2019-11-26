## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## File extension filter list (whitespace separated)
SCA_CQMETRICS_FILE_FILTER ?= ".c .cpp .h .hpp"
SCA_CQMETRICS_EXTRA_SUPPRESS ?= ""
SCA_CQMETRICS_EXTRA_FATAL ?= ""

SCA_CQMETRICS_ERROR_cyclomatic_max_gt ?= "30.0"
SCA_CQMETRICS_WARN_cyclomatic_max_gt ?= "15.0"

# possible entries for variables are 
# nchar - Number of characters
# nline - Number of lines
# line_length_min - Line length minimum
# line_length_mean - Line length mean
# line_length_median - Line length median
# line_length_max - Line length maximum
# line_length_sd - Line length standard deviation
# nempty_line - Number of empty lines
# nstatement - Number of statements
# statement_nesting_min - Nested statements minimum
# statement_nesting_mean - Nested statements mean
# statement_nesting_median  - Nested statements median
# statement_nesting_max  - Nested statements maximum
# statement_nesting_sd  - Nested statements standard deviation
# ninternal - Number of declarations with internal linkage static visibility
# nconst - Number of const keywords
# nenum - Number of enum keywords
# ngoto - Number of goto statements
# ninline - Number of inline keywords
# nnoalias - Number of noalias keywords
# nregister - Number of register keywords
# nrestrict - Number of restrict keywords
# nsigned - Number of signed keywords
# nstruct - Number of struct keywords
# nunion - Number of union keywords
# nunsigned - Number of unsigned keywords
# nvoid - Number of void keywords
# nvolatile - Number of volatile keywords
# ntypedef - Number of typedef keywords
# ncomment - Number of comments
# ncomment_char - Number of comment characters
# nboilerplate_comment_char - Number of boilerplate/license comment characters
# ndox_comment - Number of DOxygen comments
# ndox_comment_char - Number of DOxygen comment characters
# nfun_comment - Number of comments inside function bodies
# ncpp_directive - Number of C preprocessor directives
# ncpp_include - Number of C preprocessor include directives
# ncpp_conditional - Number of C preprocessor conditional directives #if, #ifdef, #elif
# nfun_cpp_directive - Number of C preprocessor directives in function bodies
# nfun_cpp_conditional - Number of C preprocessor conditional directives in function bodies
# style_inconsistency - Style inconsistency
# nfunction - Number of functions Halstead complexity
# halstead_min - Halstead complexity per function minumum
# halstead_mean - Halstead complexity per function mean
# halstead_median - Halstead complexity per function median
# halstead_max - Halstead complexity per function maximum
# halstead_sd - Halstead complexity per function standard
# nfunction2 - Number of functions cyclomatic complexity
# cyclomatic_min - Cyclomatic complexity minimum
# cyclomatic_mean - Cyclomatic complexity mean
# cyclomatic_median - Cyclomatic complexity median
# cyclomatic_max - Cyclomatic complexity maximum
# cyclomatic_sd - Cyclomatic complexity standard deviation
# nidentifier - Identifier length
# identifier_length_min - Identifier length minimum
# identifier_length_mean - Identifier length mean
# identifier_length_median - Identifier length median
# identifier_length_max - Identifier length maximum
# identifier_length_sd - Identifier length standard deviation
# unique_nidentifier - Unique identifier length
# unique_identifier_length_min - Unique identifier length minimum
# unique_identifier_length_mean - Unique identifier length mean
# unique_identifier_length_median - Unique identifier length median
# unique_identifier_length_max - Unique identifier length maximum
# unique_identifier_length_sd - Unique identifier length standard deviation
# indentation_spacing_count - Spaces used for one level of indentation
# indentation_spacing_min - Spaces used for one level of indentation minimum
# indentation_spacing_mean - Spaces used for one level of indentation mean
# indentation_spacing_median - Spaces used for one level of indentation median
# indentation_spacing_max - Spaces used for one level of indentation maximum
# indentation_spacing_sd - Spaces used for one level of indentation standard deviation
# nno_space_after_binary_op - Number of occurences of no space after binary operator
# nno_space_after_closing_brace - Number of occurences of no space after closing brace
# nno_space_after_comma - Number of occurences of no space after comma
# nno_space_after_keyword - Number of occurences of no space after keyword
# nno_space_after_opening_brace - Number of occurences of no space after opening brace
# nno_space_after_semicolon - Number of occurences of no space after semicolon
# nno_space_before_binary_op - Number of occurences of no space before binary operator
# nno_space_before_closing_brace - Number of occurences of no space before closing brace
# nno_space_before_keyword - Number of occurences of no space before keyword
# nno_space_before_opening_brace - Number of occurences of no space before opening brace
# nspace_after_opening_square_bracket - Number of occurences of space after opening square bracket
# nspace_after_struct_op - Number of occurences of space after struct operator
# nspace_after_unary_op - Number of occurences of space after unary operator
# nspace_at_end_of_line - Number of occurences of space at end of line
# nspace_before_closing_bracket - Number of occurences of space before closing bracket
# nspace_before_closing_square_bracket - Number of occurences of space before closing square bracket
# nspace_before_comma - Number of occurences of space before comma
# nspace_before_opening_square_bracket - Number of occurences of space before opening square bracket
# nspace_before_semicolon - Number of occurences of space before semicolon
# nspace_before_struct_op - Number of occurences of space before struct operator
# nspace_after_binary_op - Number of occurences of space after binary operator
# nspace_after_closing_brace - Number of occurences of space after closing brace
# nspace_after_comma - Number of occurences of space after comma
# nspace_after_keyword - Number of occurences of space after keyword
# nspace_after_opening_brace - Number of occurences of space after opening brace
# nspace_after_semicolon - Number of occurences of space after semicolon
# nno_space_after_struct_op - Number of occurences of no space after struct operator
# nspace_before_binary_op - Number of occurences of space before binary operator
# nspace_before_closing_brace - Number of occurences of space before closing brace
# nspace_before_keyword - Number of occurences of space before keyword
# nspace_before_opening_brace - Number of occurences of space before opening brace
# nno_space_before_struct_op - Number of occurences of no space before struct operator
# nno_space_after_opening_square_bracket - Number of occurences of no space after opening square bracket
# nno_space_after_unary_op - Number of occurences of no space after unary operator
# nno_space_before_closing_bracket - Number of occurences of no space before closing bracket
# nno_space_before_closing_square_bracket - Number of occurences of no space before closing square bracket
# nno_space_before_comma - Number of occurences of no space before comma
# nno_space_before_opening_square_bracket - Number of occurences of no space before opening square bracket
# nno_space_before_semicolon - Number of occurences of no space before semicolon

inherit sca-conv-to-export
inherit sca-datamodel
inherit sca-global
inherit sca-helper
inherit sca-suppress

def do_sca_conv_cqmetrics(d):
    import os
    import re
    import json
    
    package_name = d.getVar("PN")
    buildpath = d.getVar("SCA_SOURCES_DIR")

    _suppress = sca_suppress_init(d)
    _findings = []
    if os.path.exists(d.getVar("SCA_RAW_RESULT_FILE")):
        j = {}
        with open(d.getVar("SCA_RAW_RESULT_FILE")) as i:
            j = json.load(i)
        try:
            for k,v in j.items():
                for ik, v in v.items():
                    ## lt error
                    if d.getVar("SCA_CQMETRICS_ERROR_{}_lt".format(ik)):
                        val = float(d.getVar("SCA_CQMETRICS_ERROR_{}_lt".format(ik)))
                        if v < val:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="cqmetrics",
                                                    BuildPath=buildpath,
                                                    File=k,
                                                    Message="value {} is {}<{}".format(ik, v, val),
                                                    ID=ik,
                                                    Severity="error")
                            if _suppress.Suppressed(g):
                                continue
                            if not sca_is_in_finding_scope(d, "cqmetrics", g.GetFormattedID()):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
                    elif d.getVar("SCA_CQMETRICS_ERROR_{}_gt".format(ik)):
                        val = float(d.getVar("SCA_CQMETRICS_ERROR_{}_gt".format(ik)))
                        if v > val:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="cqmetrics",
                                                    BuildPath=buildpath,
                                                    File=k,
                                                    Message="value {} is {}>{}".format(ik, v, val),
                                                    ID=ik,
                                                    Severity="error")
                            if _suppress.Suppressed(g):
                                continue
                            if not sca_is_in_finding_scope(d, "cqmetrics", g.GetFormattedID()):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
                    elif d.getVar("SCA_CQMETRICS_WARN_{}_lt".format(ik)):
                        val = float(d.getVar("SCA_CQMETRICS_WARN_{}_lt".format(ik)))
                        if v < val:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="cqmetrics",
                                                    BuildPath=buildpath,
                                                    File=k,
                                                    Message="value {} is {}<{}".format(ik, v, val),
                                                    ID=ik,
                                                    Severity="warning")
                            if _suppress.Suppressed(g):
                                continue
                            if not sca_is_in_finding_scope(d, "cqmetrics", g.GetFormattedID()):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
                    elif d.getVar("SCA_CQMETRICS_WARN_{}_gt".format(ik)):
                        val = float(d.getVar("SCA_CQMETRICS_WARN_{}_gt".format(ik)))
                        if v > val:
                            g = sca_get_model_class(d,
                                                    PackageName=package_name,
                                                    Tool="cqmetrics",
                                                    BuildPath=buildpath,
                                                    File=k,
                                                    Message="value {} is {}>{}".format(ik, v, val),
                                                    ID=ik,
                                                    Severity="warning")
                            if _suppress.Suppressed(g):
                                continue
                            if not sca_is_in_finding_scope(d, "cqmetrics", g.GetFormattedID()):
                                continue
                            if g.Severity in sca_allowed_warning_level(d):
                                _findings.append(g)
        except Exception as e:
            bb.note(str(e))

    sca_add_model_class_list(d, _findings)
    return sca_save_model_to_string(d)

python do_sca_cqmetrics() {
    import os
    import subprocess
    import json
    d.setVar("SCA_EXTRA_SUPPRESS", d.getVar("SCA_CQMETRICS_EXTRA_SUPPRESS"))
    d.setVar("SCA_EXTRA_FATAL", d.getVar("SCA_CQMETRICS_EXTRA_FATAL"))
    d.setVar("SCA_SUPRESS_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cqmetrics-{}-suppress".format(d.getVar("SCA_MODE"))))
    d.setVar("SCA_FATAL_FILE", os.path.join(d.getVar("STAGING_DATADIR_NATIVE", True), "cqmetrics-{}-fatal".format(d.getVar("SCA_MODE"))))

    _args = ["qmcalc", "-ain"]

    ## Run
    json_output = {}
    tmp_result = os.path.join(d.getVar("T", True), "sca_raw_cqmetrics.json")
    d.setVar("SCA_RAW_RESULT_FILE", tmp_result)
    _files = get_files_by_extention(d, 
                                    d.getVar("SCA_SOURCES_DIR"), 
                                    clean_split(d, "SCA_CQMETRICS_FILE_FILTER"), 
                                    sca_filter_files(d, d.getVar("SCA_SOURCES_DIR"), clean_split(d, "SCA_FILE_FILTER_EXTRA")))
    _header = []
    with open(os.path.join(d.getVar("STAGING_BINDIR_NATIVE"), "header.tab")) as i:
        _header = [x for x in i.read().split("\t") if x]
    for f in _files:
        cmd_output = ""
        try:
            cmd_output = subprocess.check_output(_args + [f], universal_newlines=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            cmd_output = e.stdout or ""
        _items = [x for x in cmd_output.strip("\n").split("\t") if x]
        json_output[f] = {}
        for i in range(len(_items)):
            try:
                json_output[f][_header[i]] = float(_items[i])
            except (IndexError, ValueError):
                pass
        
    with open(tmp_result, "w") as o:
        json.dump(json_output, o, indent=4)
    
    # Create data model
    d.setVar("SCA_DATAMODEL_STORAGE", "{}/cqmetrics.dm".format(d.getVar("T")))
    dm_output = do_sca_conv_cqmetrics(d)
    with open(d.getVar("SCA_DATAMODEL_STORAGE"), "w") as o:
        o.write(dm_output)

    sca_task_aftermath(d, "cqmetrics", get_fatal_entries(d))
}

SCA_DEPLOY_TASK = "do_sca_deploy_cqmetrics"

python do_sca_deploy_cqmetrics() {
    sca_conv_deploy(d, "cqmetrics", "json")
}

addtask do_sca_cqmetrics before do_install after do_compile
addtask do_sca_deploy_cqmetrics after do_sca_cqmetrics before do_package

do_sca_cqmetrics[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_cqmetrics[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "cqmetrics-native sca-recipe-cqmetrics-rules-native"
