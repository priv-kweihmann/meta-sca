## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

def __list_chunkify(_list, _max, chunk_size=None):
    abs_size = sum(len(x) for x in _list)
    _chunk_size = chunk_size or int(abs_size / _max)
    if _chunk_size < 1:
        return [_list]
    return [_list[i:i + _chunk_size] for i in range(0, len(_list), _chunk_size)]

def exec_wrap_combine_txt(a, b, **kwargs):
    return a + b

def exec_wrap_combine_xml(a, b, **kwargs):
    if not a.startswith("<") and "<" in a:
        a = a[a.find("<"):]
    if not b.startswith("<") and "<" in b:
        b = b[b.find("<"):]
    return xml_combine(None, a, b)

def exec_wrap_combine_json(a, b, **kwargs):
    import json
    if not b.startswith("["):
        try:
            b = b[b.find("["):]
        except:
            pass
    try:
        b = json.loads(b)
    except:
        b = []

    try:
        a = json.loads(a)
        a += b
    except:
        a = b
    return json.dumps(a)

def exec_wrap_combine_json_dict(a, b, **kwargs):
    import json
    if not b.startswith("{"):
        try:
            b = b[b.find("{"):]
        except:
            pass
    try:
        b = json.loads(b)
    except:
        b = {}

    try:
        a = json.loads(a)
        a = {**a, **b}
    except:
        a = b
    return json.dumps(a)

def exec_wrap_combine_json_subarray(a, b, **kwargs):
    import json
    try:
        b = json.loads(b)
    except:
        b = {kwargs["key"]: []}

    try:
        a = json.loads(a)
        a[kwargs["key"]] += b[kwargs["key"]]
    except:
        a = b
    return json.dumps(a)

def exec_wrap_combine_json_subdict(a, b, **kwargs):
    import json
    try:
        b = json.loads(b)
    except:
        b = {kwargs["key"]: {}}

    try:
        a = json.loads(a)
        a[kwargs["key"]] = {**a[kwargs["key"]], **b[kwargs["key"]]}
    except:
        a = b
    return json.dumps(a)

def exec_wrap_tool_exec(args, files, stdout=None, stderr=None, **kwargs):
    import subprocess
    try:
        return subprocess.check_output(args + files,
                                       universal_newlines=True,
                                       stderr=stderr or subprocess.STDOUT)
    except subprocess.CalledProcessError as e:
        return e.stdout or ""

def exec_wrap_check_output(d, base_cmd, filelist, combine=exec_wrap_combine_txt, toolexec=exec_wrap_tool_exec, default_val="", chunk_size=None, stderr=None, **kwargs):
    import subprocess
    import json

    _arg_max = 131071
    try:
        _arg_max = int(subprocess.check_output(["getconf", "ARG_MAX"], universal_newlines=True, stderr=subprocess.STDOUT))
    except:
        pass

    if not isinstance(default_val, str):
        default_val = json.dumps(default_val)
    _result_out = default_val
    for chunk in __list_chunkify(filelist, _arg_max - sum(len(x) for x in base_cmd), chunk_size=chunk_size):
        if not chunk:
            continue
        cmd_output = toolexec(base_cmd, chunk, stderr, **kwargs)
        __debug_chunk = min(1024, len(str(cmd_output))) - 1
        sca_log_note(d, str(cmd_output)[0:__debug_chunk])
        _result_out = combine(_result_out, cmd_output, **kwargs)

    return _result_out
