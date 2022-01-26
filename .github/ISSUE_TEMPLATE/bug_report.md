name: 'Issue: Bug report'
description: Create a report to help us improve
title: '[Bug]: '
assignees:
  - TheButterbrotMan
body:
  - type: textarea
    id: what_happened
    attributes:
      label: What happened?
      description: Also tell us, what did you expect to happen?
    validations:
      required: true
  - type: dropdown
    id: version
    attributes:
      label: Version
      description: Which version are you using?
      options:
        - '1.0'
    validations:
      required: true
  - type: textarea
    id: log
    attributes:
      label: Provide the log
      description: Please provide us with the crash-report.log and latest.log here.
      placeholder: >-
        You can upload it (e.g. https://bytebin.lucko.me/) and post the link
        here.
  - type: markdown
    attributes:
      value: >-
        This template was generated with [Issue Forms
        Creator](https://www.issue-forms-creator.app/)